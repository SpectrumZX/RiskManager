package riskmanager;

public class Calculator {

    Float step_price, result, margin, deposit;
    Integer tp_sl, sl, contracts;


    public Object[] calculate(String step_price, String tp_sl, String sl, String contracts, String ticker, String deposit, Float margin, Float step) {

        this.sl = Integer.parseInt(sl);
        this.step_price = Float.parseFloat(step_price);
        this.contracts = Integer.parseInt(contracts);
        this.tp_sl = Integer.parseInt(tp_sl);
        this.deposit = Float.parseFloat(deposit);
      

        Object[] output = new Object[4];
        output[0] = this.sl * this.step_price * this.contracts; // StopLoss RUB
        output[1] = this.sl * this.tp_sl; // Take-profit pp
        output[2] = this.tp_sl * this.sl * this.tp_sl * this.step_price * this.contracts; // Take-profit money
        result = margin * this.contracts.floatValue() / this.deposit * step; //Leverage  ГО*кол-во контрактов/депозит*шаг цены
       System.out.println(margin+" * "+this.contracts+" / "+this.deposit+" * "+step);
        output[3] = result;
        return output;
    }

}
