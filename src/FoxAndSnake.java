    import java.util.Scanner;

    public class FoxAndSnake {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int row=scanner.nextInt();
            int colum=scanner.nextInt();
            for (int i=1;i<=row;i++)
            {
                for (int j=1;j<=colum;j++)
                {
                    if (i%2!=0)
                    {
                        System.out.print("#");
                    }else
                    {
                        if (i % 4 == 0 && j == 1)
                        {
                            System.out.print("#");
                        }else if (i % 4 != 0 && j == colum)
                        {
                            System.out.print("#");
                        }else
                        {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
