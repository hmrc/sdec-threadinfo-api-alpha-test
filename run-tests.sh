#!/usr/bin/env bash

ENVIRONMENT=$1

sbt scalafmtAll scalafmtCheckAll scalafmtSbtCheck clean compile -Denvironment="${ENVIRONMENT:=local}"
