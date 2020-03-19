     /**
     * Write a description of class CashlessInvoice here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    
    public class CashlessInvoice extends Invoice
    {
        private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
        private Promo promo;
        
        public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
        {
            super(id, food, date, customer, invoiceStatus);
        }
        
        public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
        {
            super(id, food, date, customer, invoiceStatus);
            this.promo = promo;
        }
        
        public PaymentType getPaymentType()
        {
            return PAYMENT_TYPE;
        }
        
        public Promo getPromo()
        {
            return promo;
        }
        
        public void setPromo(Promo promo)
        {
            this.promo = promo;
        }
        
        public void setTotalPrice()
        {
            if(promo!= null && promo.getActive() == true && getFood().getPrice() > promo.getMinPrice())
            {
                this.totalPrice = getFood().getPrice() - promo.getDiscount();
            }
            
            else
            {
                this.totalPrice = getFood().getPrice();
            }
        }
        
        public void printData()
        {
            if(promo != null)
            {
                
                if(promo.getActive() == true && getFood().getPrice() >= promo.getMinPrice())
                {
                    System.out.println("==========INVOICE==========");
                    System.out.println("ID : " + getId());
                    System.out.println("Food : " + getFood().getName());
                    System.out.println("Date : " + getDate());
                    System.out.println("Customer : " + getCustomer().getName());
                    System.out.println("Total price : " + getTotalPrice());
                    System.out.println("Status : " + getInvoiceStatus());
                    System.out.println("Payment Type : " + getPaymentType());
                    System.out.println("");
                    System.out.println("PROMO");
                    System.out.println("ID : " + promo.getId());
                    System.out.println("Code : " + promo.getCode());
                    System.out.println("Discount : " + promo.getDiscount());
                    System.out.println("Minimum Price : " + promo.getMinPrice());
                    System.out.println("Status : " + promo.getActive());
                    System.out.println("");
            }
            
            else
            {
                System.out.println("==========INVOICE==========");
                System.out.println("ID : " + getId());
                System.out.println("Food : " + getFood().getName());
                System.out.println("Date : " + getDate());
                System.out.println("Customer : " + getCustomer().getName());
                System.out.println("Total price : " + getTotalPrice());
                System.out.println("Status : " + getInvoiceStatus());
                System.out.println("Payment Type : " + getPaymentType());
                System.out.println("");
                System.out.println("PROMO");
                System.out.println("Promo tidak berlaku");
                System.out.println("");
            }
        }
        
        else
        {
            System.out.println("==========INVOICE==========");
            System.out.println("ID : " + getId());
            System.out.println("Food : " + getFood().getName());
            System.out.println("Date : " + getDate());
            System.out.println("Customer : " + getCustomer().getName());
            System.out.println("Total price : " + getTotalPrice());
            System.out.println("Status : " + getInvoiceStatus());
            System.out.println("Payment Type : " + getPaymentType());
            System.out.println("");
        }
    }
}
