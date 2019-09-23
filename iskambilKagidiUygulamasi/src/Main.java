import java.util.ArrayList;
import java.util.Random;

public class Main {

	
    
	public static void main(String[] args) {
		
	
	KartTarafveTakimlari kt=new KartTarafveTakimlari();
	
	IskambilKartOzellikleri[][] kartlar=new IskambilKartOzellikleri[13][4];
	
	for(int i=0;i<13;i++)
	{
		for(int j=0;j<4;j++)
		{
			kartlar[i][j]=new IskambilKartOzellikleri(kt.sayilar[i], kt.grup[j]);
		}
		
	}
		
	
	desteyiKar(kartlar);
    
	}
	
	
	public static void  goster(IskambilKartOzellikleri [][] liste)
	{
		
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(liste[i][j].getGrup()+" "+liste[i][j].getSayi());
			}
			
		}
		
	}
	
	
	public static void desteyiKar(IskambilKartOzellikleri[][] deste)
	{
		
		Random rd=new Random();
		
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<4;j++)
			{
				IskambilKartOzellikleri gecici;
				int grup=rd.nextInt(4);//0 1 2 3 üretir.
				int deger=rd.nextInt(13);
				
				
				gecici=new IskambilKartOzellikleri(deste[i][j].getSayi(),deste[i][j].getGrup());
				deste[i][j].setGrup(deste[deger][grup].getGrup());
				deste[i][j].setSayi(deste[deger][grup].getSayi());
				
				deste[deger][grup].setGrup(gecici.getGrup());
				deste[deger][grup].setSayi(gecici.getSayi());
				
				
				
			}
			
		}
		
		
		goster(deste);
	
		
		
	}

}
