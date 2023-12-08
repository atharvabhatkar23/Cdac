using System.Security.Cryptography.X509Certificates;

namespace labDay2
{
    internal class Program
    {
        static void Main(string[] args)
        {
        


            NewClass o = new NewClass() {i=10 };

          //  Console.WriteLine(o.i);
          o.Prop1 = 99;
            Console.WriteLine(o.Prop1); 
            o.display(101);
           //
           
        }
    }
    public class NewClass
    {
        public int i;

        public void display(int i = 0)
        {
            Console.WriteLine(i);

            
            display2();
            static void display2()
            {
                //Console.WriteLine("in local fn " + i);
            }

        }

        private int prop1;
        public  int Prop1 {
            set {
                prop1 = value; 
            }
            get { 
                return prop1; 
            } 
        }
    }
    public class FieldandProp
    {
        public int Prop1 { set; get; }
        public int no {

            set
            {
                if (value > 100)
                {
                    Console.WriteLine("invalid value");

                }
                else
                    no = value;
            }
            get { return no; }
        
        } 
    }

}