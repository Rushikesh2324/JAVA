//Application for class programming
#include<iostream>
using namespace std;
template <class T>

class MarvallousArray
{
    private:
        T *Arr;
        int iSize;

    public:
        
        MarvallousArray(int Length)
        {
            cout<<"INside Constructor"<<"\n";
            iSize=Length;
            Arr=new T[iSize];
            
        } 

        
        ~MarvallousArray()
        {
             cout<<"INside Destructor"<<"\n";
            delete[]Arr;

        }

        
        void Accept()
        {
            cout<<"Enter the value"<<"\n";
            for (int i =0; i<iSize;i++)
            {
                cin>>Arr[i];
            }
        }

        
        void Desplay()
        {
            cout<<"Elements of Array :"<<"\n";
            for (int i =0; i<iSize;i++)
            {
                cout<<Arr[i]<<"\n";
            }
        }

       
        T Addition()
        {
            T iSum =0 ;
            for (int i =0; i<iSize;i++)
            {
               iSum=iSum+Arr[i];
            }
            return iSum;
        }

};

int main()
{

    MarvallousArray <int>mobj1(6);
    MarvallousArray <float>mobj2(4);

    mobj1.Accept();
    mobj1.Desplay();

    mobj2.Accept();
    mobj2.Desplay();

    int iRet=0;
    iRet=mobj1.Addition();
    cout<<"Addition of mobj1:"<<iRet<<"\n";
    
    float fRet=0;
    fRet=mobj2.Addition();
    cout<<"Addition of mobj2:"<<fRet<<"\n";


    return 0;
}