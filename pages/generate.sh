#!/bin/bash

mkdir -p pages/build/presentation

# Make TP subject HTML page


# Make presentation HTML page
cp -R presentation pages/build/


# Copy all static HTML files and assets
cp -r pages/static/* pages/build
