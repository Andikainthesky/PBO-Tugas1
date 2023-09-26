#include <iostream>
using namespace std;

int main (){
	
	int nilai = 5;
	
	for (int i = 1; i <= nilai; i++){
		if (i % 2 == 0 ){
			cout << i <<" merupakan bilangan genap "<<endl;
		} else {
			cout << i <<" merupakan bilangan ganjil "<<endl;
		}
	}
	
	int j = 1;
	
	while (j <= nilai){
		cout << "Barisan ke " <<j <<endl;
		j++;
	}
	int k = 1;
	do {
		cout << "Barisan ke " <<k <<endl;
		k++;
	} while (k <= nilai);
}
