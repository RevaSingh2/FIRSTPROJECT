@echo off
echo Starting pods

:: delete all kubernetes cluster
kubectl delete -k .

:: apply the Kustomization.yaml
kubectl apply -k .

pause