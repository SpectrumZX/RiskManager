
package riskmanager;

public class FuturesEntity {
   
    private String ticker, name; 
    private Float step, price_step, margin;

    @Override
    public String toString(){
    return ticker;
    }
    
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getStep() {
        return step;
    }

    public void setStep(Float step) {
        this.step = step;
    }

    public Float getMargin() {
        return margin;
    }

    public void setMargin(Float margin) {
        this.margin = margin;
    }

    public Float getPrice_step() {
        return price_step;
    }

    public void setPrice_step(Float price_step) {
        this.price_step = price_step;
    }
    
    
}
