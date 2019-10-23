package extraparcialej05b;

import javax.swing.JOptionPane;

public class Extraparcialej05b {

    public static void main(String[] args) {

        /* Determinar el signo del horoscopo chino deacuerdo al año de nacimiento */
        
        /*
    	int year, res;
    	
    	year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a�o de nacimiento: "));
    	res = year % 12;
    	
        // Profesora quiere que use OR
        
        
    	if (year >= 0 && year <= 2020) {
    		if (res == 0) {
    			JOptionPane.showMessageDialog(null, "Mono");
    		} else if (res == 1) {
    			JOptionPane.showMessageDialog(null, "Gallo");
    		} else if (res == 2) {
    			JOptionPane.showMessageDialog(null, "Perro");
    		} else if (res == 3) {
    			JOptionPane.showMessageDialog(null, "Chancho");
    		} else if (res == 4) {
    			JOptionPane.showMessageDialog(null, "Rata");
    		} else if (res == 5) {
    			JOptionPane.showMessageDialog(null, "Buey");
    		} else if (res == 6) {
    			JOptionPane.showMessageDialog(null, "Tigre");
    		} else if (res == 7) {
    			JOptionPane.showMessageDialog(null, "Conejo");
    		} else if (res == 8) {
    			JOptionPane.showMessageDialog(null, "Dragon");
    		} else if (res == 9) {
    			JOptionPane.showMessageDialog(null, "Serpiente");
    		} else if (res == 10) {
    			JOptionPane.showMessageDialog(null, "Caballo");
    		} else if (res == 11) {
    			JOptionPane.showMessageDialog(null, "Oveja");
    		}
    	} else {
    		JOptionPane.showMessageDialog(null, "Error a�o de nacimiento");
    	}
        */
        
        int year2;
        year2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año entre 1934 y 2004"));
        
        if (year2 == 1934 || 
                year2 == 1946 || 
                year2 == 1958 || 
                year2 == 1970 || 
                year2 == 1982 || 
                year2 == 1994) {
            JOptionPane.showMessageDialog(null, "Perro");
        } else if (year2 == 1935 || 
                year2 == 1947 || 
                year2 == 1959 || 
                year2 == 1971 || 
                year2 == 1983 || 
                year2 == 1995){
            JOptionPane.showMessageDialog(null, "Cerdo");
        } else if (year2 == 1936 || 
                year2 == 1948 || 
                year2 == 1960 || 
                year2 == 1972 || 
                year2 == 1984 || 
                year2 == 1996){
            JOptionPane.showMessageDialog(null, "Rata");
        } else if (year2 == 1937 || 
                year2 == 1949 || 
                year2 == 1961 || 
                year2 == 1973 || 
                year2 == 1985 || 
                year2 == 1997){
            JOptionPane.showMessageDialog(null, "Buey");
        } else if (year2 == 1938 || 
                year2 == 1950 || 
                year2 == 1962 || 
                year2 == 1974 || 
                year2 == 1986 || 
                year2 == 1998){
            JOptionPane.showMessageDialog(null, "Tigre"); 
        } else if (year2 == 1939 || 
                year2 == 1951 || 
                year2 == 1963 || 
                year2 == 1975 || 
                year2 == 1987 || 
                year2 == 1999){
            JOptionPane.showMessageDialog(null, "Conejo"); 
        } else if (year2 == 1940 || 
                year2 == 1952 || 
                year2 == 1964 || 
                year2 == 1976 || 
                year2 == 1988 || 
                year2 == 2000){
            JOptionPane.showMessageDialog(null, "Dragon"); 
        } else if (year2 == 1941 || 
                year2 == 1953 || 
                year2 == 1965 || 
                year2 == 1977 || 
                year2 == 1989 || 
                year2 == 2001){
            JOptionPane.showMessageDialog(null, "Serpiente");
        } else if (year2 == 1942 || 
                year2 == 1954 || 
                year2 == 1966 || 
                year2 == 1978 || 
                year2 == 1990 || 
                year2 == 2002){
            JOptionPane.showMessageDialog(null, "Caballo");
        } else if (year2 == 1943 || 
                year2 == 1955 || 
                year2 == 1967 || 
                year2 == 1979 || 
                year2 == 1991 || 
                year2 == 2003){
            JOptionPane.showMessageDialog(null, "Oveja");
        } else if (year2 == 1944 || 
                year2 == 1956 || 
                year2 == 1968 || 
                year2 == 1980 || 
                year2 == 1992 || 
                year2 == 2004){
            JOptionPane.showMessageDialog(null, "Mono");
        } else if (year2 == 1945 || 
                year2 == 1957 || 
                year2 == 1969 || 
                year2 == 1981 || 
                year2 == 1993 || 
                year2 == 2005){
            JOptionPane.showMessageDialog(null, "Gallo");
        }
    } 
    
}
