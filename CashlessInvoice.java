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
        
        public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
        {
            super(id, food, customer, invoiceStatus);
        }
        
        public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
        {
            super(id, food, customer, invoiceStatus);
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
                    return "==========INVOICE==========" +
                           "ID : " + getId() +
                           "Food : " + getFood().getName() +
                           "Date : " + getDate() +
                           "Customer : " + getCustomer().getName() +
                           "Total price : " + getTotalPrice() +
                           "Status : " + getInvoiceStatus() +
                           "Payment Type : " + getPaymentType() +
                           "\n" +
                           "PROMO" +
                           "ID : " + promo.getId() +
                           "Code : " + promo.getCode() +
                           "Discount : " + promo.getDiscount() +
                           "Minimum Price : " + promo.getMinPrice() +
                           "Status : " + promo.getActive() +
                           "\n";
            }
            
            else
            {
                return "==========INVOICE==========" +
                           "ID : " + getId() +
                           "Food : " + getFood().getName() +
                           "Date : " + getDate() +
                           "Customer : " + getCustomer().getName() +
                           "Total price : " + getTotalPrice() +
                           "Status : " + getInvoiceStatus() +
                           "Payment Type : " + getPaymentType() +
                           "\n" +
                           "PROMO" +
                           "Promo tidak berlaku" +
                           "\n";
            }
        }
        
        else
        {
            return "==========INVOICE==========" +
                   "ID : " + getId() +
                   "Food : " + getFood().getName() +
                   "Date : " + getDate() +
                   "Customer : " + getCustomer().getName() +
                   "Total price : " + getTotalPrice() +
                   "Status : " + getInvoiceStatus() +
                   "Payment Type : " + getPaymentType() +
                   "\n";
        }
    }
}
