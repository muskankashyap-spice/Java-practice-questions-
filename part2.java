public class part2{
    public static void main(String[]args){
        int n=5647;
        int c=0;
        for (;n!=0;n/=10){
            c++;
        }
        System.out.println(c);
    }



 public static void main(String[]args){
        int n=446;
        int count =0;
        for(;n!=0;n/=10){
            count++;
        }
        System.out.println(count++);
    }


    public static void main(String[]args){
        int n=446;
        int count =0;
        for(;n!=0;n/=10){
            count++;
        }
        System.out.println(count++);
    }

/*--------------------------------------------- */
    public static void main(String[]args){
        int n=3456;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }

public static void main(String[]args){
        int n=3456;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }

public static void main(String[]args){
        int n=3456;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }

/*================================================ */
public static void main(String[]args){
    int n=2342;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    System.out.println(rev);
}
public static void main(String[]args){
    int n=286;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    System.out.println(rev);
}
public static void main(String[]args){
    int n=225;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    System.out.println(rev);
}
/*-------------------------------------------- */
public static void main(String[]args){
    int n=0765;
    int rev=0;
    int temp=n;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    if(temp==rev){
    System.out.println("Palindrome");}
    else{
        System.out.println("Not a palindrome");
    }
}
public static void main(String[]args){
    int n=1212;
    int rev=0;
    int temp=n;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    if(temp==rev){
    System.out.println("Palindrome");}
    else{
        System.out.println("Not a palindrome");
    }
}
public static void main(String[]args){
    int n=2394;
    int rev=0;
    int temp=n;
    while(n>0){
        int rem=n%10;
        rev=rev*10+(rem);
        n/=10;
    }
    if(temp==rev){
    System.out.println("Palindrome");}
    else{
        System.out.println("Not a palindrome");
    }
}
/*------------------------------------------------- */
public static void main(String[]args){
    int n=50;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
}
public static void main(String[]args){
    int n=82;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
}
public static void main(String[]args){
    int n=23;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
}
/*------------------------------- */
public static void main(String[]args){
    int n=234;
    int pro=1;
    while(n>0){
        int d=n%10;
        pro*=d;
        n/=10;
    }
    System.out.println(pro);
}
public static void main(String[]args){
    int n=26;
    int pro=1;
    while(n>0){
        int d=n%10;
        pro*=d;
        n/=10;
    }
    System.out.println(pro);
}
public static void main(String[]args){
    int n=34;
    int pro=1;
    while(n>0){
        int d=n%10;
        pro*=d;
        n/=10;
    }
    System.out.println(pro);
}
