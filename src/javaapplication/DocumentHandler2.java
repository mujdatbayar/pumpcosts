/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.SAVE_DIALOG;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author soner
 */
public class DocumentHandler2 {
    JFileChooser saveFile;
    private String currentDoc;

    public DocumentHandler2() {
     this.saveFile = new JFileChooser(){
    @Override
    public void approveSelection(){
        File f = getSelectedFile();
        if(f.exists() && getDialogType() == SAVE_DIALOG){
            int result = JOptionPane.showConfirmDialog(this,"The file exists, overwrite?","Existing file",JOptionPane.YES_NO_CANCEL_OPTION);
            switch(result){
                case JOptionPane.YES_OPTION:
                    super.approveSelection();
                    return;
                case JOptionPane.NO_OPTION:
                    return;
                case JOptionPane.CLOSED_OPTION:
                    return;
                case JOptionPane.CANCEL_OPTION:
                    cancelSelection();
                    return;
            }
        }
        super.approveSelection();
    }
    };
     
     saveFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
     saveFile.setFileFilter(new FileFilter() {        
 
       @Override
       public String getDescription() {
            return "Pump Properties File (*.ppf)";
        }
 
       @Override
       public boolean accept(File f) {
            if (f.isDirectory()) {
                return true;
            } else {
                return f.getName().toLowerCase().endsWith(".ppf");
            }
        }
    });
     
        this.currentDoc = null;
    }
    
    
    
    public int save(Study2 study){
        XStream xstream = new XStream();
        String xml = xstream.toXML(study);
        
        int returnVal = saveFile.showSaveDialog(null);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                java.io.File file = saveFile.getSelectedFile();
            try{
                
                FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(xml);
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(DocumentHandler2.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
        return 0;
    }
    
    public Study2 load(){
        int returnVal = saveFile.showOpenDialog(null);
        String s;
        XStream xstream = new XStream();
        Study2 study = null;
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                java.io.File file = saveFile.getSelectedFile();
            try{
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[(int)file.length()];
                fis.read(data);
                fis.close();
                
                s = new String(data, "UTF-8");
                study = (Study2)xstream.fromXML(s);
            } catch (IOException ex) {
                Logger.getLogger(DocumentHandler2.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      return study;
    }
    
}
