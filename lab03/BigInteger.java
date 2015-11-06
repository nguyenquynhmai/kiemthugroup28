import java.util.Arrays;
public class BigInteger
{
    String b_integer = new String();
    

    public BigInteger() {}
    public BigInteger(long init) {

        b_integer = String.valueOf(init);
    }

    public BigInteger(String init)   {
        final int lengIn = init.length();
        
        int j = 0;
        for(int i = 0;i < lengIn; i++){

            if(init.charAt(i) != '0')
                break;
            
            j++;
                
        }
        if( j == lengIn)
            b_integer = "0";

        else if(j > 0){
            final int leng = lengIn - j;
            char[] c = new char[leng];
            int index = 0;
            for (int i = j;i < lengIn ;i++ ) {
                 c[index] = init.charAt(i);
                 index++;
            
            }
            String s = new String(c);

            b_integer = s;
        }
          
        else{

            b_integer = init;
        }

    }
    
    public String toString() {
        return b_integer;
    }

    
    public boolean larger(BigInteger other){

        // 2 so trai dau
        if(b_integer.charAt(0) == '-' && other.b_integer.charAt(0) != '-')
            return false;

        if(b_integer.charAt(0) != '-' && other.b_integer.charAt(0) == '-')
            return true;

        // 2 so bang nhau
        if(this.equals(other))
            return false;

        // 2 so cung dau
        
        // neu this dai  hon other
        if(b_integer.length() > other.b_integer.length()){

            // neu 2 so duong thi this > other
            if(b_integer.charAt(0) != '-' && other.b_integer.charAt(0) != '-')
                return true;
            else
            // 2 so la am thi this < other
                return false;
        }

        // neu this ngan hon other
        if(b_integer.length() < other.b_integer.length()){

            // neu 2 so duong thi this < other
            if(b_integer.charAt(0) != '-' && other.b_integer.charAt(0) != '-')
                return false;
            else
            // 2 so la so am thi this > other
                return true;
        }

        // 2 so co cung do dai
        for (int i = 0;i < b_integer.length() ;i++ ) {
            // neu phan tu thu i cua this lon hon thu i cua other 
            // thi this > other
            if(b_integer.charAt(i) > other.b_integer.charAt(i))
                return true;
        }
        // false các phan tu cua other  > this
        return false;

    }
    public void swap(BigInteger other){
        BigInteger temp = new BigInteger();
        temp.b_integer = this.b_integer;
        this.b_integer  = other.b_integer;
        other.b_integer = temp.b_integer;
    }

    public boolean equals(Object other) {
        return toString().equals(other.toString());
    }

    public long toLong() {

        long result = Long.valueOf(b_integer);
        return result;
    }

    public int compareTo(BigInteger other){

        if(this.equals(other) == true)
            return 0;

        else if(this.larger(other) == true)
            return 1;

            else
                return -1;
    }

    public BigInteger clone(){
        BigInteger newBigIn = new BigInteger(this.b_integer);
        return newBigIn;
    }
    public BigInteger add(BigInteger other) {
        
        int length1 = b_integer.length();
        int length2 = other.b_integer.length() ;
        int i1;
        int i2;
        int i3;
        int reme = 0;
        final int leng = Math.max(length1,length2);

        char c[] ;
        c = new char[leng];

        int lengC = leng - 1;
        int count1 = length1 - 1;
        int count2 = length2 - 1;

        
            while( count1 >= 0 && count2 >= 0){
                i1 = (int)(b_integer.charAt(count1) - '0') ;
                i2 = (int)(other.b_integer.charAt(count2) - '0') ;

                i3 = i1 + i2 + reme;
                if(i3 >= 10){

                    i3 -= 10; 
                    reme = 1;
                    c[lengC] = (char)('0' + i3);

                }
                else{
                    reme = 0;
                    c[lengC] = (char)('0' + i3);

                }

                count1--;
                count2--;
                lengC--;

            }

            if(count1 > count2){
                while(count1 >= 0){
                    i1 = (int)(b_integer.charAt(count1) - '0') ;

                    i3 = i1 + reme;
                    if(i3 >= 10){
                        i3 -= 10;
                        reme = 1;
                        
                    }
                    else{
                        reme = 0;
                        
                    }
                    c[lengC] = (char)('0' + i3);
                    count1--;
                    lengC--;
                }
            }
            if(count1 < count2){
                while(count2 >= 0){
                    i2 = (int)(b_integer.charAt(count2) - '0') ;

                    i3 = i2 + reme;
                    if(i3 >= 10){
                        i3 -= 10;
                        reme = 1;
                        
                    }
                    else{
                        reme = 0;
                        
                    }
                    c[lengC] = (char)('0' + i3);
                    count2--;
                    lengC--;
                }
            }

        String  s = new String(c);
        
        if(reme == 1)
            s = '1' + s;
        
        BigInteger result = new BigInteger(s);
        return result;
    }
    public void printBigIn(){
        System.out.println(b_integer);
    }

    public BigInteger subtract(BigInteger other) {
        
        if(this.larger(other) == true){
            int length1 = b_integer.length();
            int length2 = other.b_integer.length() ;
            int i1, i2, i3;
            int reme = 0;
            final int leng = Math.max(length1,length2);

            char c[] ;
            c = new char[leng];

            int lengC = leng - 1;
            int count1 = length1 - 1;
            int count2 = length2 - 1;
            while( count1 >= 0 && count2 >= 0){
                i1 = (int)(b_integer.charAt(count1) - '0') ;
                i2 = (int)(other.b_integer.charAt(count2) - '0') ;

                // kiem tra xem chu so thu count1 < (count2 + reme)
                if(i1 < (i2 + reme)){
                    i1 += 10;
                    i3 = i1 - i2 - reme;
                    reme = 1;
                }
                else{
                    i3 = i1 - i2 - reme;
                    reme = 0;
                }

                c[lengC] = (char)('0' + i3);
                count1--;
                count2--;
                lengC--;

            }

            if(count1 > count2){
                while(count1 >= 0){
                    i1 = (int)(b_integer.charAt(count1) - '0') ;

                    
                    if(i1 < reme){
                        i1 += 10;
                        i3 = i1 - reme;
                        reme = 1;
                        
                    }
                    else{
                        i3 = i1 - reme;
                        reme = 0;
                        
                    }

                    c[lengC] = (char)('0' + i3);
                    count1--;
                    lengC--;
                }
            }

            String  s = new String(c);
            BigInteger result = new BigInteger(s);
            return result;


        }
        else{
            this.swap(other);
            int length1 = b_integer.length();
            int length2 = other.b_integer.length() ;
            int i1, i2, i3;
            int reme = 0;
            final int leng = Math.max(length1,length2);

            char c[] ;
            c = new char[leng];

            int lengC = leng - 1;
            int count1 = length1 - 1;
            int count2 = length2 - 1;
            while( count1 >= 0 && count2 >= 0){
                i1 = (int)(b_integer.charAt(count1) - '0') ;
                i2 = (int)(other.b_integer.charAt(count2) - '0') ;

                // kiem tra xem chu so thu count1 < (count2 + reme)
                if(i1 < (i2 + reme)){
                    i1 += 10;
                    i3 = i1 - i2 - reme;
                    reme = 1;
                }
                else{
                    i3 = i1 - i2 - reme;
                    reme = 0;
                }

                c[lengC] = (char)('0' + i3);
                count1--;
                count2--;
                lengC--;

            }

            if(count1 > count2){
                while(count1 >= 0){
                    i1 = (int)(b_integer.charAt(count1) - '0') ;

                    
                    if(i1 < reme){
                        i1 += 10;
                        i3 = i1 - reme;
                        reme = 1;
                        
                    }
                    else{
                        i3 = i1 - reme;
                        reme = 0;
                        
                    }

                    c[lengC] = (char)('0' + i3);
                    count1--;
                    lengC--;
                }
            }

            String  s = new String(c);
            if(this.equals(other) == false)
                s = '-' + s;
            BigInteger result = new BigInteger(s);
            return result;
        }

            
            
    }
    
}