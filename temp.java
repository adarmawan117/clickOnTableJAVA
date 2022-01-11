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
	    /*
	    
	    CARA LAIN : https://stackoverflow.com/a/47927726
	    
	    Calendar ca = new GregorianCalendar();
	String day = ca.get(Calendar.DAY_OF_MONTH) + "";
	String month = ca.get(Calendar.MONTH) + 1 + "";
	String year = ca.get(Calendar.YEAR) + "";

	if (day.length() == 1) {
	    day = "0" + day;
	}
	if (month.length() == 1) {
	    month = "0" + month;
	}

	String dd = year + "-" + month + "-" + day;

	Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
	jDateChooser1.setDate(date);
	    */
            dateTanggalMasuk.setDateFormatString(tabelObat.getValueAt(i, 7).toString());
        }
