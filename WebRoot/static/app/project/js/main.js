layui.use(['layer', 'form'], function() {
  var 
  $ = layui.jquery,
  tree = layui.tree,
  form = layui.form(),
  layer = layui.layer;

  layer.msg('Hello World');

  // ---------init---------
  // 获取project的pattern
  var pattern = $('select[name="project"] option:selected').attr('pattern');
  if(pattern == 'normal') {
    $('select[name="type"]').find('option').eq(1).attr('selected', true);
  }else if(pattern == 'simulation'){
    $('select[name="type"]').find('option').eq(2).attr('selected', true);
  }
  form.render('select');
  // ---------init---------
  
  // 重新初始化ZTree,select[name="type"]
  form.on('select(project)', function(data){
    debugger
    $(data.elem)
  });

  form.on('select(type)', function(data){
    
  });


  $('.create-folder').on('click', function(){
    layer.prompt({
      title: '请输入folder名称',
      area: ['400px', '50px'] //自定义文本域宽高
    }, function(value, index, elem){
      $.when($.getJSON('/project/createFolder', {
        'project.id': $('body').attr('project-id'),
        'folder.name': value
      })).done(function(r) {
        if(r.code == 0) {
          window.location.reload();
        } else {
          layer.msg('保存失败');
        }
      });
    });
  });

  $('.detele-folder').on('click', function(){
    layer.confirm('确定删除该folder吗?', {
      icon: 3, title:'删除'
    }, function(value, index, elem){
      var folder_id = $('#interface_tree').attr('folder-id');
      if(folder_id == null || folder_id == '') {
        layer.msg('请选择folder');
        return;
      }
      $.when($.getJSON('/project/deteleFolder', {
        'folder.id': folder_id,
        'folder.name': value
      })).done(function(r) {
        if(r.code == 0) {
          window.location.reload();
        } else {
          layer.msg('删除失败');
        }
      });
    });
  });

}); // layui-fun

$(function() {
  var zTreeObj;
  var project_id = 1;
  $('body').attr('project-id', project_id);
  
  $.when($.getJSON('/project/getTreeFolder', {'project.id': project_id}))
  .done(function(r) {
    if(r.code == 0) {
      // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
      var setting = {
        callback: {
          onClick: zTreeOnClick
        }
      };
      var zNodes = r.data;
      $.fn.zTree.init($("#interface_tree"), setting, zNodes);
    }
  });

  var zTreeOnClick = function(event, treeId, treeNode) {
    var interface_id = treeNode.interface_id;
    if(interface_id != null) {
      $('#interface_tree').attr('folder-id', null)
      $('#interface_tree').attr('interface-id', interface_id)
    } else {
      $('#interface_tree').attr('folder-id', treeNode.folder_id)
      $('#interface_tree').attr('interface-id', null)
    }
  }

});