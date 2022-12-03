import java.util.Scanner;
public class hotelmenu {
    private static Scanner sc;
    public static void main(String[] args) {
        System.out.println("welcome to our hotel you can order whatever you like");
        sc = new Scanner(System.in);
        int i,ch,ch2,sumct=0,totalbill=0,sum=0;
        char more;
		int[] ct1=new int[21];
		int[] ct2=new int[21];
        int[] itemct=new int[21];
        String item[]={"kathiyavadi fix thali","unlimited thali","undhiyu chapadi","kadhi khichadi",
        "paneer handi","matar panir","panner angara","paneer tufani","naan",
        "chinese bhel","manchurian","noodles","fried rice",
        "khaman-dhokla","samosa","vadapav","french-fries",
        "masala-soda","tea","coffee","butter-milk"};//size 21
        int itempr[]={80,120,70,50,90,90,100,100,10,60,60,50,50,40,30,20,50,10,10,20,10};
        restart: while(true)
        {    
            System.out.println("Enter your choice\n1..for gujarati dish\n2..for punjabi dish\n3..for chinese dish\n4..for snacks\n5..for beverages");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter your choice\n1..for " + item[0] + "\n2..for "+ item[1] +"\n3..for "+ item[2] + " \n4..for " + item[3] + "\n5..to goto main menu");
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                        case 1:
                        System.out.println("you chose " + item[0] + " and its price is " + itempr[0]);
                        System.out.println("how many plates do you want:");
                        itemct[0]=sc.nextInt();
						ct1[0]=itemct[0];
						ct2[0]+=ct1[0];
                        System.out.println("the amount is " + (itempr[0]*itemct[0]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 2:
                        System.out.println("you chose " + item[1] + " and its price is " + itempr[1]);
                        System.out.println("how many plates do you want:");
                        itemct[1]=sc.nextInt();
						ct1[1]=itemct[1];
						ct2[1]+=ct1[1];
                        System.out.println("the amount is " + (itempr[1]*itemct[1]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 3:
                        System.out.println("you chose " + item[2] + " and its price is " + itempr[2]);
                        System.out.println("how many plates do you want:");
                        itemct[2]=sc.nextInt();
						ct1[2]=itemct[2];
						ct2[2]+=ct1[2];
                        System.out.println("the amount is " + (itempr[2]*itemct[2]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 4:
                        System.out.println("you chose " + item[3] + " and its price is " + itempr[3]);
                        System.out.println("how many plates do you want:");
                        itemct[3]=sc.nextInt();
						ct1[3]=itemct[3];
						ct2[3]+=ct1[3];
                        System.out.println("the amount is " + (itempr[3]*itemct[3]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 5:
                        if(ch2==5)
                        {
                            continue restart;
                        }
                        break;
                    }
                    break;
                case 2:
                System.out.println("Enter your choice\n1..for " + item[4] + "\n2..for "+ item[5] +"\n3..for "+ item[6] + " \n4..for " + item[7] + "\n5..for "+ item[8] + "\n6.. to goto main menu");
                ch2=sc.nextInt();
                switch(ch2)
                    {
                        case 1:
                        System.out.println("you chose " + item[4] + " and its price is " + itempr[4]);
                        System.out.println("how many plates do you want:");
                        itemct[4]=sc.nextInt();
						ct1[4]=itemct[4];
						ct2[4]+=ct1[4];
                        System.out.println("the amount is " + (itempr[4]*itemct[4]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 2:
                        System.out.println("you chose " + item[5] + " and its price is " + itempr[5]);
                        System.out.println("how many plates do you want:");
                        itemct[5]=sc.nextInt();
						ct1[5]=itemct[5];
						ct2[5]+=ct1[5];
                        System.out.println("the amount is " + (itempr[5]*itemct[5]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 3:
                        System.out.println("you chose " + item[6] + " and its price is " + itempr[6]);
                        System.out.println("how many plates do you want:");
                        itemct[6]=sc.nextInt();
						ct1[6]=itemct[6];
						ct2[6]+=ct1[6];
                        System.out.println("the amount is " + (itempr[6]*itemct[6]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 4:
                        System.out.println("you chose " + item[7] + " and its price is " + itempr[7]);
                        System.out.println("how many plates do you want:");
                        itemct[7]=sc.nextInt();
						ct1[7]=itemct[7];
						ct2[7]+=ct1[7];
                        System.out.println("the amount is " + (itempr[7]*itemct[7]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 5:
                        System.out.println("you chose " + item[8] + " and its price is " + itempr[8]);
                        System.out.println("how many "+ item[8] +" do you want:");
                        itemct[8]=sc.nextInt();
						ct1[8]=itemct[8];
						ct2[8]+=ct1[8];
                        System.out.println("the amount is " + (itempr[8]*itemct[8]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;                        
                        case 6:
                        if(ch2==6)
                        {
                            continue restart;
                        }
                        break;
                    }
                    break;

                case 3:
                System.out.println("Enter your choice\n1..for " + item[9] + "\n2..for "+ item[10] +"\n3..for "+ item[11] + " \n4..for " + item[12] + "\n5..to goto main menu");
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                        case 1:
                        System.out.println("you chose " + item[9] + " and its price is " + itempr[9]);
                        System.out.println("how many plates do you want:");
                        itemct[9]=sc.nextInt();
						ct1[9]=itemct[9];
						ct2[9]+=ct1[9];
                        System.out.println("the amount is " + (itempr[9]*itemct[9]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 2:
                        System.out.println("you chose " + item[10] + " and its price is " + itempr[10]);
                        System.out.println("how many plates do you want:");
                        itemct[10]=sc.nextInt();
						ct1[10]=itemct[10];
						ct2[10]+=ct1[10];
                        System.out.println("the amount is " + (itempr[10]*itemct[10]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 3:
                        System.out.println("you chose " + item[11] + " and its price is " + itempr[11]);
                        System.out.println("how many plates do you want:");
                        itemct[11]=sc.nextInt();
						ct1[11]=itemct[11];
						ct2[11]+=ct1[11];
                        System.out.println("the amount is " + (itempr[11]*itemct[11]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 4:
                        System.out.println("you chose " + item[12] + " and its price is " + itempr[12]);
                        System.out.println("how many plates do you want:");
                        itemct[12]=sc.nextInt();
						ct1[12]=itemct[12];
						ct2[12]+=ct1[12];
                        System.out.println("the amount is " + (itempr[12]*itemct[12]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 5:
                        if(ch2==5)
                        {
                            continue restart;
                        }
                        break;
                    }
                    break;
                case 4:
                System.out.println("Enter your choice\n1..for " + item[13] + "\n2..for "+ item[14] +"\n3..for "+ item[15] + " \n4..for " + item[16] + "\n5..to goto main menu");
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                        case 1:
                        System.out.println("you chose " + item[13] + " and its price is " + itempr[13]);
                        System.out.println("how many plates do you want:");
                        itemct[13]=sc.nextInt();
						ct1[13]=itemct[13];
						ct2[13]+=ct1[13];
                        System.out.println("the amount is " + (itempr[13]*itemct[13]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 2:
                        System.out.println("you chose " + item[14] + " and its price is " + itempr[14]);
                        System.out.println("how many plates do you want:");
                        itemct[14]=sc.nextInt();
						ct1[14]=itemct[14];
						ct2[14]+=ct1[14];
                        System.out.println("the amount is " + (itempr[14]*itemct[14]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 3:
                        System.out.println("you chose " + item[15] + " and its price is " + itempr[15]);
                        System.out.println("how many plates do you want:");
                        itemct[15]=sc.nextInt();
						ct1[15]=itemct[15];
						ct2[15]+=ct1[15];
                        System.out.println("the amount is " + (itempr[15]*itemct[15]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 4:
                        System.out.println("you chose " + item[16] + " and its price is " + itempr[16]);
                        System.out.println("how many plates do you want:");
                        itemct[16]=sc.nextInt();
						ct1[16]=itemct[16];
						ct2[16]+=ct1[16];
                        System.out.println("the amount is " + (itempr[16]*itemct[16]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 5:
                        if(ch2==5)
                        {
                            continue restart;
                        }
                        break;
                    }
                    break;
                case 5:
                System.out.println("Enter your choice\n1..for " + item[17] + "\n2..for "+ item[18] +"\n3..for "+ item[19] + " \n4..for " + item[20] + "\n5..to goto main menu");
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                        case 1:
                        System.out.println("you chose " + item[17] + " and its price is " + itempr[17]);
                        System.out.println("how many "+ item[17] +" do you want:");
                        itemct[17]=sc.nextInt();
						ct1[17]=itemct[17];
						ct2[17]+=ct1[17];
                        System.out.println("the amount is " + (itempr[17]*itemct[17]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 2:
                        System.out.println("you chose " + item[18] + " and its price is " + itempr[18]);
                        System.out.println("how many " + item[18] +" do you want:");
                        itemct[18]=sc.nextInt();
						ct1[18]=itemct[18];
						ct2[18]+=ct1[18];
                        System.out.println("the amount is " + (itempr[18]*itemct[18]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 3:
                        System.out.println("you chose " + item[19] + " and its price is " + itempr[19]);
                        System.out.println("how many " + item[19] + " do you want:");
                        itemct[19]=sc.nextInt();
						ct1[19]=itemct[19];
						ct2[19]+=ct1[19];
                        System.out.println("the amount is " + (itempr[19]*itemct[19]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 4:
                        System.out.println("you chose " + item[20] + " and its price is " + itempr[20]);
                        System.out.println("how many " + item[20] + " do you want:");
                        itemct[20]=sc.nextInt();
						ct1[20]=itemct[20];
						ct2[20]+=ct1[20];
                        System.out.println("the amount is " + (itempr[20]*itemct[20]));
                        System.out.println("want something else!!then press y otherwise press anything to procide further");
                        more=sc.next().charAt(0);
                        if(more=='y' || more=='Y')
                        {
                            continue restart;
                        }
                        break restart;
                        case 5:
                        if(ch2==5)
                        {
                            continue restart;
                        }
                        break;
                    }
                    break;
                default:System.out.println("something went wrong!!please try again later");
				break restart;
				//System.exit(0);
            }
        }
        int c=0;
        for(i=0;i<21;i++)
        {
            if(ct2[i]!=0)
            {
                sumct+=ct2[i];
                sum=(ct2[i]*itempr[i])+sum;
                c++;
            }
        }
        if(c!=0)
        {
            System.out.println("thank you for your order here is your bill...");
            System.out.println("item" + "\t" + "order" + "\t" + "price" + "\t" +"total per item");
            
            for(i=0;i<21;i++)
            {
                if(ct2[i]!=0)
                {
                    System.out.println(item[i] + "\t" + ct2[i] + "\t" + itempr[i] + "\t" + (ct2[i]*itempr[i]));
                }
            }
            //System.out.println("the new sum="+ct2);
            totalbill=sum;
            System.out.println("total orders=" + sumct + " total bill=" + totalbill);
        } 
    }
}