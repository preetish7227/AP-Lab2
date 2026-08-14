class Cloth{
    void setMeasurment(int x) throws LongShirtException{
        if(x>5)
        throw new LongShirtException();
        else
        System.out.println("Shirt is fit");
    }
    
}