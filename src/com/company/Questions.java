package com.company;

public class Questions {
    public class modifi18
    {
        public void main()
        {
            int count = 0;
            int a,b,c;
            for(int i = 100; i<=999 ; ++i )
            {
                System.out.println(i);
                if (i%18 != 0 )
                {
                    System.out.println("number is not divisible by 18");
                }else
                {
                    int same = i ;
                    a = same/100;
                    same = (same-(a*100));
                    b = same/10;
                    same = (same-(b*10));
                    c = same;
                    int sum = a+b+c;
                    if(a==b || b==c || c==a)
                    {
                        System.out.println("Digit are same");
                    }else if((sum%18)!= 0)
                    {
                        System.out.println("sum is not divisible by 18");
                    }else if((sum%18) != 0)
                    {
                        System.out.println("sum is not equal to 18");
                    }else
                    {
                        count = count + 1;
                        System.out.println("condition successful");
                    }
                }
            }
            System.out.println("Total number with all condition are =" + count);
        }
    }
}
