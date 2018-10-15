int[] input = new int[] {0, 1, 2, 0, 0, 2, 0, 1, 0, 2, 1, 0, 1, 1, 0, 0, 2, 2, 2, 2, 0};
int[] counters = new int[3];
for (int i : input)
	++counters[i];
int[] output = new int[input.length];
int j = 0;
for (int i = 0; i <= 2; ++i) {
	while (counters[i] > 0) {
		--counters[i];
		output[j] = i;
		++j;
	}
}
