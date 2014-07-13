package org.yazgel.hermes.codegenerator.template;

import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.yazgel.hermes.Entity;
import org.yazgel.hermes.codegenerator.template.BaseGenerator;

@SuppressWarnings("all")
public class ObjectifyRegistryGenerator extends BaseGenerator {
  public void generateFile(final IFileSystemAccess fsa) {
    String _objectifyRegistryQName = this.objectifyRegistryQName();
    String _replace = _objectifyRegistryQName.replace(".", "/");
    String _plus = (_replace + ".java");
    CharSequence _objectifyRegistryContent = this.objectifyRegistryContent(BaseGenerator.entityList);
    fsa.generateFile(_plus, _objectifyRegistryContent);
  }
  
  public CharSequence objectifyRegistryContent(final Set<Entity> entities) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _objectifyRegistryPackage = this.objectifyRegistryPackage();
    _builder.append(_objectifyRegistryPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _objectifyRegistryName = this.objectifyRegistryName();
    _builder.append(_objectifyRegistryName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void register() {");
    _builder.newLine();
    {
      for(final Entity e : entities) {
        _builder.append("\t\t");
        _builder.append("com.googlecode.objectify.ObjectifyService.register(");
        String _packagename = this.packagename(e);
        String _plus = (_packagename + ".");
        String _name = e.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ".class");
        _builder.append(_plus_2, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
