class Prime{
    public static void main(String[] args) {
        int limit=20;
        for(int i=2;i<=limit;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;

                }
            }
            if(isPrime)
            {
                System.out.println(i+" ");
            }
        }
        System.out.println("Prime");
    }
}
