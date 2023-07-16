#!/bin/bash

current_hour=$(date +%H)

if (( current_hour >= 0 && current_hour < 12 )); then
    echo "Good morning!"
elif (( current_hour >= 12 && current_hour < 18 )); then
    echo "Good afternoon!"
else
    echo "Good evening!"
fi
