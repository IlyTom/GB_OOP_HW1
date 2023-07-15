public class Product {
        private String name;
        private Integer price;

        Product(String name, Integer price){
            this.name = name;
            this.price = price;
        }
        Product(String name){
            this.name = name;
            this.price = null;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Integer getPrice(){
            return price;
        }
        public void setPrice(Integer price){
            this.price=price;
        }

        @Override
        public String toString() {
            return "Product {name = " + name +" price = "+price+"}";
        }
}
