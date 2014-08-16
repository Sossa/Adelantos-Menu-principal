package Logica;


public class AreaCircunferencia {
    
}

public double CalcularAreaCircunferencia (double radio,double area) {
	
        double pi = 3.14;
        radio = Integer.parseInt(tfRadio.getText());
        double area = pi*Math.pow(radio, 2);
        tfArea.setText(""+area);
	}
}
