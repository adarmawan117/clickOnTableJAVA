				// TODO add your handling code here:
        int i = tabelObat.getSelectedRow();
        
        if(i>-1){
            txtKodeObat.setText(tabelObat.getValueAt(i, 0).toString());
            txtNamaObat.setText(tabelObat.getValueAt(i, 1).toString());
            txtHargaModal.setText(tabelObat.getValueAt(i, 2).toString());
            txtHargaJual.setText(tabelObat.getValueAt(i, 3).toString());
            dateTanggalExp.setDateFormatString(tabelObat.getValueAt(i, 4).toString());
            comboBoxJenis.setSelectedItem(tabelObat.getValueAt(i, 5).toString());
            txtStok.setText(tabelObat.getValueAt(i, 6).toString());
            dateTanggalMasuk.setDateFormatString(tabelObat.getValueAt(i, 7).toString());
        }
