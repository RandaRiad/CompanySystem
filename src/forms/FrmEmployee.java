/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import DB.GoToDB;
import company.CreateTools;
import entity.Department;
import entity.Employee;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dfz6
 */
public class FrmEmployee extends javax.swing.JFrame {

    /**
     * Creates new form FrmEmployee
     */
    public FrmEmployee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hiringDate = new com.toedter.calendar.JDateChooser();
        birthdayEmp = new com.toedter.calendar.JDateChooser();
        empNo = new javax.swing.JTextField();
        empName = new javax.swing.JTextField();
        empSalary = new javax.swing.JTextField();
        empAddress = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        find = new javax.swing.JButton();
        all = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        mainForm = new javax.swing.JButton();
        deptNo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee No:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Department Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Salary :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hiring Date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("BirthDay : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address :");

        hiringDate.setDateFormatString("yyyy-MM-dd");

        birthdayEmp.setDateFormatString("yyyy-MM-dd");
        birthdayEmp.setMaxSelectableDate(new java.util.Date(253370797264000L));
        birthdayEmp.setMinSelectableDate(new java.util.Date(-62135737136000L));

        empNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNoActionPerformed(evt);
            }
        });

        empName.setToolTipText("");

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        find.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        find.setText("Find");
        find.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        all.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        all.setText("All");
        all.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        searchText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        searchText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Search :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee Form");

        table1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee NO", " Name", "Salary", "Hiring Date", "BirthDay", "Department no", "Address"
            }
        ));
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table1.setGridColor(new java.awt.Color(102, 153, 255));
        table1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table1.setSelectionForeground(new java.awt.Color(51, 0, 51));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        mainForm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mainForm.setText("Main Form");
        mainForm.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        mainForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFormActionPerformed(evt);
            }
        });

        deptNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptNoActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), java.awt.Color.gray));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainForm, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hiringDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deptNo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(empNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(hiringDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(birthdayEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(deptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(mainForm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     Employee emp=new Employee();
     DefaultTableModel model;
     SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");

     private void setValue() throws ParseException{

         emp.setAddress(empAddress.getText());
        emp.setDeptNO((int) deptNo.getSelectedItem());
        emp.setEmpName(empName.getText());
        
        emp.setHiringDate(f.format( hiringDate.getDate()));
         emp.setBirthDay(f.format(birthdayEmp.getDate()));

        emp.setSalary(Double.parseDouble(empSalary.getText()));
        emp.setEmpNo(Integer.parseInt(empNo.getText()));


    } 
    protected void getAllData(){
           ArrayList<Employee> arrayDpt=emp.getAllRows();
           model=(DefaultTableModel) table1.getModel();
          int rowsNum=model.getRowCount();
           for(int i=rowsNum-1;i>=0;i--){
            
            model.removeRow(i);
            
              }
           
         for(Employee e:arrayDpt){
         String [] data= {String.valueOf(e.getEmpNo()),e.getEmpName(),String.valueOf(e.getSalary()),String.valueOf(e.getHiringDate()),String.valueOf(e.getBirthDay()),String.valueOf(e.getDeptNO()),e.getAddress()};
          model.addRow(data);
             
         }
    }
   
    private void clearData(){
    
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        addBtn.setEnabled(true);
        empNo.setEnabled(true);
        CreateTools.clearText(this);
        empName.requestFocus();
    
    }
    
    private void lastNumberOfTable(){
    Employee lastdept=emp.getLastRowOfTable();
        
         model=(DefaultTableModel) table1.getModel();
         String [] data= {String.valueOf(lastdept.getEmpNo()),lastdept.getEmpName(),String.valueOf(lastdept.getSalary()),String.valueOf(lastdept.getHiringDate()),String.valueOf(lastdept.getBirthDay()),String.valueOf(lastdept.getDeptNO()),lastdept.getAddress()};

         model.addRow(data);
         empNo.setText(String.valueOf(lastdept.getEmpNo()+1));
    }
    
                              
    int numberRow;
    private void selectedRow() throws ParseException{
    
         numberRow=table1.getSelectedRow();
         empNo.setText(String.valueOf(table1.getValueAt(numberRow, 0)));
         empName.setText(String.valueOf(table1.getValueAt(numberRow, 1)));
        empSalary.setText(String.valueOf(table1.getValueAt(numberRow,2)));
        hiringDate.setDate(f.parse(table1.getValueAt(numberRow,3).toString()));
        birthdayEmp.setDate(f.parse(table1.getValueAt(numberRow,4).toString()));
        deptNo.setSelectedItem(Integer.parseInt((String) table1.getValueAt(numberRow,5)));
        empAddress.setText(String.valueOf(table1.getValueAt(numberRow,6)));

        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        addBtn.setEnabled(false);
        setValue();

     
    }
    
    
    
    private void empNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNoActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try{
            setValue();
            //  nameDept.setText(String.valueOf(table1.getValueAt(numberRow, 1)));
            // locationDept.setText(String.valueOf(table1.getValueAt(numberRow,2)));
            emp.update( numberRow+1);
            Employee de= emp.getOneRow(numberRow+1);
            //model.fireTableDataChanged();
            // model.setValueAt(de.getDeptNo(), numberRow,0);
            model.setValueAt(de.getEmpName(), numberRow, 1);
            model.setValueAt(de.getSalary(), numberRow,2);
            model.setValueAt(de.getHiringDate(), numberRow,3);
            model.setValueAt(de.getBirthDay(), numberRow,4);
            model.setValueAt(de.getDeptNO(), numberRow,5);
            model.setValueAt(de.getAddress(), numberRow,6);

            clearData();

        }
        catch( Exception ex){
            CreateTools.msgBox(ex.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        try{
            selectedRow();
            setValue();
            emp.delete(numberRow+1);
            model.fireTableDataChanged();

            clearData();
        }
        catch( Exception ex){
            CreateTools.msgBox(ex.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed

        String deptNo= CreateTools.inputBox("Enter Empolyee No ");
        ArrayList<Employee> arrayDpt=emp.searchData(Integer.parseInt(deptNo));
        model=(DefaultTableModel) table1.getModel();
        int rowsNum=model.getRowCount();
        for(int i=rowsNum-1;i>=0;i--){

            model.removeRow(i);

        }

        for(Employee lastEmp:arrayDpt){
         String [] data= {String.valueOf(lastEmp.getEmpNo()),lastEmp.getEmpName(),String.valueOf(lastEmp.getSalary()),String.valueOf(lastEmp.getHiringDate()),String.valueOf(lastEmp.getBirthDay()),String.valueOf(lastEmp.getDeptNO()),lastEmp.getAddress()};
            model.addRow(data);

        }

    }//GEN-LAST:event_findActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:

        getAllData();
    }//GEN-LAST:event_allActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clearData();
    }//GEN-LAST:event_clearActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        // TODO add your handling code here:

        String search=searchText.getText().trim();
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<> (model);
        table1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        tr.removeRowSorterListener(table1);
    }//GEN-LAST:event_searchTextKeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        try {
            // TODO add your handling code here:
            selectedRow();
        } catch (ParseException ex) {
                   CreateTools.msgBox(ex.getMessage());        }

        empNo.setEnabled(false);
    }//GEN-LAST:event_table1MouseClicked

    private void mainFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFormActionPerformed

        this.dispose();
        CreateTools.openForm(new frmMain());
    }//GEN-LAST:event_mainFormActionPerformed

    private void deptNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptNoActionPerformed
        // TODO add your handling code here:
        //new GoToDB().fillCombo("department", "dept_no", deptNo);
    }//GEN-LAST:event_deptNoActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
              try{
           empNo.setEnabled(true);
        setValue();
        emp.add();
        //lastNumberOfTable();
        model.setRowCount(0);

        getAllData();

        clearData(); 
       }
       catch( Exception ex){
       CreateTools.msgBox("Please Enter your Empolyee InFormation");
       }
    }//GEN-LAST:event_addBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         getAllData();
              new GoToDB().fillCombo("department","dept_name","dept_no", deptNo);

       clearData();
    }//GEN-LAST:event_formWindowOpened

    
  /*  private void selectedRow(){
    
         numberRow=table1.getSelectedRow();
         empNo.setText(String.valueOf(table1.getValueAt(numberRow, 0)));
         empName.setText(String.valueOf(table1.getValueAt(numberRow, 1)));
        empSalary.setText(String.valueOf(table1.getValueAt(numberRow,2)));
        hiringDate.setDateFormatString(table1.getValueAt(numberRow,3).toString());
        birthdayEmp.setDateFormatString(String.valueOf(table1.getValueAt(numberRow,4)));
        deptNo.setSelectedIndex(Integer.parseInt((String) table1.getValueAt(numberRow,5)));
        empAddress.setText(String.valueOf(table1.getValueAt(numberRow,6)));

        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        addBtn.setEnabled(false);
        setValue();

     
    }
    
    
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton all;
    private com.toedter.calendar.JDateChooser birthdayEmp;
    private javax.swing.JButton clear;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> deptNo;
    private javax.swing.JTextField empAddress;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empNo;
    private javax.swing.JTextField empSalary;
    private javax.swing.JButton find;
    private com.toedter.calendar.JDateChooser hiringDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainForm;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable table1;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
