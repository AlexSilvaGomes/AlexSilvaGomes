package enum_;

enum Status {
	Published(1), Rejected(2); // Line 2
	int index;  // Line 3	
	Status(int i) { index = i; }
        int getIndex(){return index;} // Line 5
}