#include <iostream>
using namespace std;

int main(){
	string nama [3]; //String merupakan tipe data dengan variabel data
	nama[0];
	nama[1];
	nama[2];
	
	cout << "Masukkan Nama Ke 1 : ";
	cin >> nama[0]; 
	// Menginputkan nama ke 1
	
	cout << "Masukkan nama ke 2 : ";
	cin >> nama[1];
	// Menginputkan nama ke 2
	cout << "Masukkan nama ke 3 : ";
	cin >> nama [2];
	// Menginputkan nama ke 3
	
	cout << endl;
	
	cout << "Nama Anak Pertama : "<<nama[0]<<endl;
	// output nama anak pertama
	cout << "Nama Anak Kedua : "<<nama[1]<<endl;
	// output nama anak kedua
	cout << "Nama Anaka ketiga : "<<nama[2]<<endl;
	// output nama anak ketiga
}
