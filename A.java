
class A {
    private int myNum;
    private String myName;

    public A(int myNum, String myName) {
        this.myNum = myNum;
        this.myName = myName;
    }

    public void testForNum() {
        if (myNum <= myName.length()) {
            for (int i=0; i < myNum; i++) {
                System.out.println(this.myName);
            }
        }
    }

    public boolean testContains(String aWord) {
        if (myName.contains(aWord)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        A a = new A(5, "David OBrien");

        a.testForNum();

        System.out.println(a.testContains("avid"));
    }

}