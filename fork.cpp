#include <stdio.h>
#include <conio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>


void  ChildProcess(void);                          

void  main(void)
{
	pid_t  pid;
	int girilen_sayi;
    int adim_sayisi=0;
    printf (" Bir sayi giriniz : " );
    scanf("%d",&girilen_sayi);
    pid = fork();
    if (pid == 0){
        if(girilen_sayi > 0){
		  while (girilen_sayi != 1) {
                    if (girilen_sayi % 2 == 0)
                    {
                        girilen_sayi /= 2;
                        adim_sayisi++;
                    }
                    else 
                    {
                        if (girilen_sayi % 2 == 1 && girilen_sayi!= 1)
                        {
                           girilen_sayi = girilen_sayi * 3 + 1;
                            adim_sayisi++;
                        } 
                    }
            } 
		    printf("sonuc: %d\n", girilen_sayi);
    		printf("adým sayýsý: %d", adim_sayisi );
    	    printf(" Child process bitti. \n");
	   }
	
	   else{
		  printf("sayi pozitif degil. \n");
	   }   
   }
   
   
    else  {
          wait(NULL);
          printf("Parent process \n");
     }
     

     getch();
}

//yorum






















