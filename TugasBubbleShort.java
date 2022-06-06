public class TugasBubbleShort{

    private int[] data;
    private String[] dataStr;

    //constructor
    public TugasBubbleShort(){
    }


    public String[] getDataStr() {return dataStr; }

    public void setDataStr(String[] dataStr) {
        this.dataStr = dataStr;
    }

    public void sortDataStr(int n){
        int lenDataStr = n;
        for(int i = 0; i<lenDataStr; i++){
            for (int j = i+1; j<lenDataStr; j++){
                if (this.dataStr[i].compareTo(this.dataStr[j]) > 0){
                    String temp = this.dataStr[i];
                    this.dataStr[i] = this.dataStr[j];
                    this.dataStr[j] = temp;
                }
            }
        }
    }

    public void PrintDataStr(){
        for (String datum : this.dataStr){
            System.out.println(datum+" ");
        }
    }


    public static void main(String[] args) {

        String[] nama = {"spiderman","superman","batman","wonderwomen","gundala"};
        int b = nama.length;



        TugasBubbleShort _myBubbleStr = new TugasBubbleShort();
        _myBubbleStr.setDataStr(nama);
        _myBubbleStr.sortDataStr(b);
        _myBubbleStr.PrintDataStr();
    }
}
