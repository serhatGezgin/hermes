package org.yazgel.hermes.codegenerator.template;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.yazgel.hermes.DataType;
import org.yazgel.hermes.DataTypes;
import org.yazgel.hermes.Entity;
import org.yazgel.hermes.Feature;
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _insertMethod = this.insertMethod(e);
    _builder.append(_insertMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence insertMethod(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static ");
    String _qualifiedname = this.qualifiedname(e);
    _builder.append(_qualifiedname, "");
    _builder.append(" insert(");
    String _insertParams = this.insertParams(e);
    _builder.append(_insertParams, "");
    _builder.append(") throws Exception{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _qualifiedname_1 = this.qualifiedname(e);
    _builder.append(_qualifiedname_1, "\t");
    _builder.append(" ");
    String _variablename = this.variablename(e);
    _builder.append(_variablename, "\t");
    _builder.append(" = new ");
    String _qualifiedname_2 = this.qualifiedname(e);
    _builder.append(_qualifiedname_2, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _ownedFeature = e.getOwnedFeature();
      Iterable<DataType> _filter = Iterables.<DataType>filter(_ownedFeature, DataType.class);
      for(final DataType f : _filter) {
        _builder.append("\t");
        String _variablename_1 = this.variablename(e);
        _builder.append(_variablename_1, "\t");
        _builder.append(".");
        String _settername = this.settername(f);
        _builder.append(_settername, "\t");
        _builder.append("(");
        String _name = f.getName();
        _builder.append(_name, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("com.googlecode.objectify.ObjectifyService.ofy().save().entity(");
    String _variablename_2 = this.variablename(e);
    _builder.append(_variablename_2, "\t");
    _builder.append(").now();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    String _variablename_3 = this.variablename(e);
    _builder.append(_variablename_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String insertParams(final Entity e) {
    String _xblockexpression = null;
    {
      final ArrayList<Object> sb = CollectionLiterals.<Object>newArrayList();
      EList<Feature> _ownedFeature = e.getOwnedFeature();
      Iterable<DataType> _filter = Iterables.<DataType>filter(_ownedFeature, DataType.class);
      final Consumer<DataType> _function = new Consumer<DataType>() {
        public void accept(final DataType it) {
          DataTypes _type = it.getType();
          String _plus = (_type + " ");
          String _name = it.getName();
          String _plus_1 = (_plus + _name);
          sb.add(_plus_1);
        }
      };
      _filter.forEach(_function);
      _xblockexpression = IterableExtensions.join(sb, ",");
    }
    return _xblockexpression;
  }
}
