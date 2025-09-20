# Introduction
This folder contains the Extended Data Flow Analysis (DFA-Ext) used in our article "Detecting Information Flow Security Vulnerabilities by Analysis Coupling" in the journal Transactions On Software Engineering. 

DFA-Ext provides additional analysis capabilities to the [Dataflow Analysis](https://dataflowanalysis.org/) (DFA) version 3.0 to evaluate data flows and deployments based on parameters of provided component services. 

For information about the DFA, please visit the [respective Website](https://dataflowanalysis.org/).

## Approach
The DFA-Ext uses an additional [Parameterannotation Metamodel](https://github.com/CASCADE-AnalysisCoupling/TSE_Reiche_TransformationsAndModels/tree/main/bundles/Metamodels/edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation) which enables annotating Parameters of OperationSignatures in the Palladio Component Model (PCM) with Dataflow Characteristics. 

Based on this annotation, DFA-Ext evaluations the following properties in the [Evaluator](https://github.com/CASCADE-AnalysisCoupling/TSE_Reiche_TransformationsAndModels/blob/main/bundles/EDFA/edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension/src/edu/kit/kastel/sdq/coupling/analysis/dataflowanalysisextension/Evaluator.java):

* Does the deployment of a Component which provides an OperationSignature with an annotated Parameter to an annotated Resource violate the given security policy?
* Does data with a given security characteristic flow to an annotated parameter so that the security policy is violated?
* (For completeness to resemble the original DFA): Does data with a given security characteristic flow to a resource which is not allowed due to the given security policy?   

## Setup
For usage of the models and the DFA-Ext, please perform the following actions to execute the DFA-Ext. 

* Download and unpack the [Eclipse Modeling Tools v. 2023-09](https://www.eclipse.org/downloads/packages/release/2023-09/r/eclipse-modeling-tools)
* For installing the required plugins, please provide the following Eclipse Update Sites to Eclipse (in Eclipse: help -> Install New Software -> Add..):
    * [Metamodel-Modeling-Foundations](https://updatesite.mdsd.tools/metamodel-modeling-foundations/nightly/)
    * [Palladio Component Model v. 5.2.0](https://updatesite.palladio-simulator.com/palladio-build-updatesite/releases/5.2.0/)
    * [DFD-Metamodel v. 3.0.0](https://dataflowanalysis.github.io/updatesite/release/dfd-metamodel/v3.0.0/)
    * [PCM-DataFlowAnalysis-Extension v. 5.2.0](https://dataflowanalysis.github.io/updatesite/release/pcm-dataflowanalysis-extension/v5.2.0/)
    * [DataFlowAnalysis v. 3.0.0](https://dataflowanalysis.github.io/updatesite/release/dataflowanalysis/v3.0.0/)
* Install *Data Flow Analysis Feature* and the *Data Flow Analysis PCM Extension Feature*
* We use a specific commit version of the DFA. For using this version please...
    * Clone [this fork of the DFA](https://github.com/reichef/DataFlowAnalysis)
    * Checkout the branch EDFA-Modification
    * Import the projects *org.dataflowanalysis.analysis* and *org.dataflowanalysis.analysis.pcm* into your eclipse workspace.
* From this repository import the *identifier* metamodel and the *parameterannotation* metamodel projects as well as their *.edit* and *.editor* projects in the folder **Metamodels** in this repository. 
* Import the DFA-Ext project [*edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension*](./edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension)

## Execution
We use JUnit test cases to execute the DFA-Ext. 
For an example please inspect the file [EDFA.java](./edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension/src/edu/kit/kastel/sdq/coupling/analysis/dataflowanalysisextension/EDFA.java) in the DFA-Ext Project.
Here, please replace the string *\[PathToTSECaseStudyRepo\]* with your local path to our [case study repository](https://github.com/CASCADE-AnalysisCoupling/CaseStudies_CouplingSpecificationBasedAnalyses_TSE).
Execute the analysis of a single case by executing a JUnit Plug-In test (e.g., right-click on test method -> Run as.. -> JUnit Plug-In Test). 


