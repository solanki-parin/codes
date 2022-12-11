

public class arrayeach {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("1 dimension array");
        for(int i:arr)
        {
            System.out.println(i);
        }
        int arr2[][]={{1,2},{3,4},{5,6},{7,8}};
        System.out.println("2 dimension array");
        for(int i[]:arr2)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }
        int arr3[][][]={{{1,2},{1,2}},{{3,4},{3,4}},{{5,6},{5,6}},{{7,8},{7,8}}};
        System.out.println("3 dimension array");
        for(int i[][]:arr3)
        {
            for(int j[]:i)
            {
                for(int k:j)
                {
                    System.out.println(k);
                }
            }
        }
    }
}
