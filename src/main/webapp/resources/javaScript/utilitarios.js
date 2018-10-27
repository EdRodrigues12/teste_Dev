var isTextarea = false;

function travarEventoEnter(event) {
	if (event.keyCode == 13 && isTextarea) {
		return false;
	}
	var d = event.srcElement || event.target;
	if (d.tagName.toUpperCase() === 'INPUT' && event.keyCode == 13){
		event.preventDefault();
		return false
	}
}

$(document).unbind('keydown').bind('keydown', function (event) {
    var doPrevent = false;
    if (event.keyCode === 8) {
        var d = event.srcElement || event.target;
        if (d.tagName.toUpperCase() === 'INPUT' && (d.type.toUpperCase() === 'TEXT' || d.type.toUpperCase() === 'PASSWORD' || d.type.toUpperCase() === 'FILE') || d.tagName.toUpperCase() === 'TEXTAREA') {
            doPrevent = d.readOnly || d.disabled;
        }
        else {
            doPrevent = true;
        }
    }
    if (doPrevent) {
        event.preventDefault();
    }
});
