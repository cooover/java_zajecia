package gatunki;
/*
2)Rozwi� program Gatunki , w ten spos�b, �eby:
	obiekt typu Gatunek m�g� przechowywa� dane chromosom�w. Powinna to by� tablica obiekt�w typu Chromosom o d�ugo�ci odpowiadaj�cej liczbie
	chromosom�w

Utw�rz klas� Chromosom:
	w ten spos�b aby dane dotycz�ce numeru chromosomu i d�ugo�ci ramion by�y wprowadzane tylko wtedy, je�li podane liczby s� wi�ksze
	od 0 w przypadku numeru chromosomu i wi�ksze lub r�wne 0 w przypadku d�ugo�ci ramion
	dodaj konstruktory:
		przyjmuj�cy jako argumenty numer chromosomu i d�ugo�ci ramion, pole plciowy ustawiaj�cy domy�lnie jako false
		przyjmuj�cy jako argumenty wszystkie dane

kolejne gatunki by�y przechowywane w tablicy obiekt�w typu Gatunek
 */
public class Chromosom {
	int nrChromosomu, dlRamion;
	boolean plciowy;
	
	Chromosom(int nrChromosomu, int dlRamion){
		if (nrChromosomu>0) {
			this.nrChromosomu = nrChromosomu;
		}
		if (dlRamion>=0) {
			this.dlRamion = dlRamion;
		}
		this.plciowy = false;
	}
	
	Chromosom(int nrChromosomu, int dlRamion, boolean plciowy) {
		if (nrChromosomu>0) {
			this.nrChromosomu = nrChromosomu;
		}
		if (dlRamion>=0) {
			this.dlRamion = dlRamion;
		}
		this.plciowy = plciowy;
	}
}
