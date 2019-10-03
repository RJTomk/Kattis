echo "TESTING CHANGES"
if [[ $# -eq 3 ]]; then
  NUM_TESTS=$3
  INPUTCODE=$1

  javac "$INPUTCODE.java"

  for (( i = 1; i <= $NUM_TESTS; i++ )); do
    echo "Test $i"

    INPUTFILE="$2$i.in"
    OUTPUTFILE="$2$i.out"

    java $INPUTCODE < $INPUTFILE > out.out

    DIFF=$(diff -q out.out  $OUTPUTFILE)
    if [ "$DIFF" != "" ]; then
      diff -y out.out $OUTPUTFILE
    else
      echo "Pass"
    fi

    rm out.out
  done
else
  echo "Inadequate number of arguments"
fi
