var el = $('.tabs').first()[0];
var instance = M.Tabs.init(el);

$(function() {
    // initialization of form
    $('select').formSelect();
    $('.modal').modal();

    $("#re_password").keypress(function() {
        if ($("#re_password").val().length < 6) {
            $("#re_password").addClass("invalid");
        } else {
            $("#re_password").removeClass("invalid");
        }
    })
})