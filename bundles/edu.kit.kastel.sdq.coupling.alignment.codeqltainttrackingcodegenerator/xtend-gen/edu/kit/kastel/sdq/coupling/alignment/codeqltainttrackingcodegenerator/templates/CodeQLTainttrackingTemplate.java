package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class CodeQLTainttrackingTemplate {
  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateMetaData = this.generateMetaData();
    _builder.append(_generateMetaData);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePackageImports = this.generatePackageImports();
    _builder.append(_generatePackageImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateSecurityLevels = this.generateSecurityLevels();
    _builder.append(_generateSecurityLevels);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateLabelFunction = this.generateLabelFunction();
    _builder.append(_generateLabelFunction);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateAvailableLabelCheck = this.generateAvailableLabelCheck();
    _builder.append(_generateAvailableLabelCheck);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateAllowedFlows = this.generateAllowedFlows();
    _builder.append(_generateAllowedFlows);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateConfiguration = this.generateConfiguration();
    _builder.append(_generateConfiguration);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateInformationFlowModuleUsage = this.generateInformationFlowModuleUsage();
    _builder.append(_generateInformationFlowModuleUsage);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateLevelToStringFunction = this.generateLevelToStringFunction();
    _builder.append(_generateLevelToStringFunction);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateQuery = this.generateQuery();
    _builder.append(_generateQuery);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected abstract String generateLevelToStringFunction();
  
  protected abstract String generatePackageImports();
  
  protected abstract String generateMetaData();
  
  protected abstract String generateAvailableLabelCheck();
  
  protected abstract String generateInformationFlowModuleUsage();
  
  protected abstract String generateConfiguration();
  
  protected abstract String generateAllowedFlows();
  
  protected abstract String generateLabelFunction();
  
  protected abstract String generateSecurityLevels();
  
  protected abstract String generateQuery();
}
