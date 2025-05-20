# TSE_Reiche_TransformationsAndModels
This repository comprises all models, transformations and other tooling in the folder *bundles* for the case study in the TSE paper "Detecting Information Flow Vulnerabilities by Analysis Coupling".

The **bundles* content is further subdivided into the following folders:

- **Consistency** comprises the **ModelTransformation** and **CodeGeneration** folders with the corresponding transformations. For the code generation, we use [Xtend](https://eclipse.dev/Xtext/xtend/). 
- **Non-Conformance-Analysis** comprises projects to execute CodeQL or JOANA.
- **Integration** comprises projects for the *Integration* transformation. This is subdivided into the overall transformation projects [CodeAnalysis]2[ArchitecturalAnalysis] and subprojects realizing dedicated tasks.
- **Metamodels** comprises all metamodels created for the case study.
- **FrameworkSteps** comprises the definition of the Process Steps for the (Coupling Framework)[https://github.com/KASTEL-CSSDA/Architecture-And-StaticCode-Analyses-CouplingFramework] for the coupling of the Access Analysis or DFA-Extended with CodeQL and JOANA. 

