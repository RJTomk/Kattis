# folderName Type Name num
FOLDER=$1
TYPE=""
PROGNAME=$3
TEXTNAME=${PROGNAME,,}
NUM=$4

case ${2,,} in
  "j")
  TYPE=".java"
  ;;
  "p")
  TYPE=".py"
  ;;
esac

mkdir $FOLDER
touch "$FOLDER/$PROGNAME$TYPE"
touch $FOLDER/$TEXTNAME{1..$NUM}.{in,out}

#for (( i = 1; i <= $NUM; i++ )); do
#  touch "$FOLDER/$TEXTNAME$i.in" "$FOLDER/$TEXTNAME$i.out"
#done
