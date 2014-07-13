package org.yazgel.hermes.codegenerator.template;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.yazgel.hermes.Entity;
import org.yazgel.hermes.codegenerator.template.BaseGenerator;

@SuppressWarnings("all")
public class EntityControllerGenerator extends BaseGenerator {
  public void generateFile(final Entity e, final IFileSystemAccess fsa) {
    String _controllerfilename = this.controllerfilename(e);
    CharSequence _controllerContent = this.controllerContent(e);
    fsa.generateFile(_controllerfilename, _controllerContent);
  }
  
  public CharSequence controllerContent(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _controllerpackagename = this.controllerpackagename(e);
    _builder.append(_controllerpackagename, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _controllername = this.controllername(e);
    _builder.append(_controllername, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("\t\t");
    String _objectifyRegistryQName = this.objectifyRegistryQName();
    _builder.append(_objectifyRegistryQName, "\t\t");
    _builder.append(".register();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
