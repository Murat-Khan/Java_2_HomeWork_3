public  class BankAccount  {

  private double amount;
   public void deposit(Double sum){
        amount = amount + sum;

   }

   public void  withDraw(double sum) throws  LimitException {

       if (sum > amount){
           throw new LimitException("Запрашиваемая сумма на снятие, превышает текущий счет ", amount);
       }
       System.out.println("Вы сняли со счета: " + sum);
       amount = amount - sum;
   }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
