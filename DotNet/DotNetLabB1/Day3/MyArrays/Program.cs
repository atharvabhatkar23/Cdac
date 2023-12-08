namespace MyArrays
{
    internal class Program
    {
        //static void Main(string[] args)
        //{
        //    int[] arr=new int[5];
        //    for(int  i=0; i<arr.Length; i++)
        //    {
        //        //Console.WriteLine("Enter the value of arr[" + i + "]");//String concat
        //        //Console.WriteLine("Enter the value for arr[{0}]", i);//placeHolder
        //        Console.WriteLine($"Enter the value for arr[{i}]");//String interpolation
        //        //arr[i] = int.Parse(Console.ReadLine());
        //        arr[i] = Convert.ToInt32(Console.ReadLine());

        //    }
        //    //for(int i=0;i<arr.Length; i++)
        //    //{
        //    //   Console.WriteLine($"The value of arr[{i}] is {arr[i]}");
        //    //}

        //    foreach (int num in arr)
        //    {
        //        Console.WriteLine(num);
        //    }
        //}
        static void Main(string[] args)
        {
            //int[] arr1 = new int[5] { 1, 2, 3, 4, 5 };
            int[] arr2 = { 11, 12, 13, 14, 15 };
            //int pos = Array.IndexOf(arr2, 14);
            int posi=Array.LastIndexOf(arr2, 15);
            Console.WriteLine(posi);
            
        }
    }
}