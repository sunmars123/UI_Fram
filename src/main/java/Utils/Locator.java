package Utils;

public class Locator {
        private Locator(){}
        private String element;
        private int timeOut;
        private Bytype bytype;
        public Locator(String element,int timeOut,Bytype bytype){
            this.element=element;
            this.bytype=bytype;
            this.timeOut=timeOut;
        }
        public Locator(String element,Bytype bytype){
            this.element=element;
            this.bytype=bytype;
        }
        public Locator(Bytype bytype){
            this.element=element;
            this.bytype=bytype;
        }
        public void setBytype(Bytype bytype) {
            this.bytype = bytype;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public void setTimeOut(int timeOut) {
            this.timeOut = timeOut;
        }

        public Bytype getBytype() {
            return bytype;
        }

        public int getTimeOut() {
            return timeOut;
        }

        public String getElement() {
            return element;
        }

    @Override
    public String toString() {
        return "[element: "+element +" timeOut: "+timeOut+" Bytype : "+ bytype +"]";
    }
}
