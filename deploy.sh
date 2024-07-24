#!/bin/bash
cd /home/runner/work
git clone https://github.com/Chaintech-Network/CMPCharts.git
sudo rsync -avz --delete --exclude='.*' --exclude='cmpcharts' /home/runner/work/CMPCharts_org/CMPCharts_org/ /home/runner/work/CMPCharts/
cd CMPCharts/
git config --global user.email "$2"
git config --global user.name "$3"
git add .
git commit -m "$4"
git push https://$3:$1@github.com/Chaintech-Network/CMPCharts.git main