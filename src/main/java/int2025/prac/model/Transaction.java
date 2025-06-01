package int2025.prac.model;

public class Transaction {
     private String date;
        private int amount;

        // Constructor
        public Transaction(String date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        // Getter for date
        public String getDate() {
            return date;
        }

        // Getter for amount
        public int getAmount() {
            return amount;
        }

        // Optional: Setter methods if needed
        public void setDate(String date) {
            this.date = date;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        // Optional: toString() for easy printing
        @Override
        public String toString() {
            return "Transaction{date='" + date + "', amount=" + amount + '}';
        }
    }

