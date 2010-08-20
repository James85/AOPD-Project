#!/bin/bash

NO_ARGS=$#   # Get the number of arguments passed in the command line

##### TEST ALL ARGUMENTS ARE THERE
if (( "$NO_ARGS" != 1 )); then
  printf "usage: pack-agent.sh <number>\n"
  exit
fi


zip -r "agent-$1.zip"  design.pd src lib/jackagt.jar run-team.sh compile.sh
