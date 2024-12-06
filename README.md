# Scala Data Parsing Bug

This repository demonstrates a common error in Scala when parsing data and handling potential exceptions. The `bug.scala` file contains code that attempts to parse a list of strings into a case class `Person`. The code uses `Try` to handle exceptions, but it doesn't properly handle all potential failure scenarios, resulting in an incomplete parsed list.

The `bugSolution.scala` file provides a corrected solution that comprehensively addresses potential issues such as invalid input formats and missing data.

## Bug Description

The original code fails to handle cases where the input strings don't have the expected format (e.g., missing age or extra commas). The use of `split(',')` and then accessing `parts(1)` without checking bounds can lead to `IndexOutOfBoundsException` if a string does not contain a comma or has only one element.

## Solution

The improved code uses pattern matching to handle various input cases, providing robustness against unexpected data formats.  It also leverages Option to handle missing data and provides more informative error messages.