#!/bin/bash

chr() {
	printf \\$(printf( '%03o' $1))
}

ord() {
	printf '%d' "'$1'"
}

A=$(ord $1)
B=$(ord $2)

echo $(($A - $B))
