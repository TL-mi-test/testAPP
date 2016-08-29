<?php

$template = file_get_contents('./template.html');
$list = getFileList('./');

$tableContentString = <<< HTML
              <tr>
                <td><!-- category --></td>
                <td><!-- file --></td>
              </tr>

HTML;

$rowString = '';

foreach($list as $key1 => $value1){
	foreach($value1 as $value){
		$rowString = $rowString . $tableContentString;
		$rowString = str_replace('<!-- category -->', $key1, $rowString);
		$rowString = str_replace('<!-- file -->', $value, $rowString);
//		echo $key1 . " : " . $value . '<br />'. PHP_EOL;
	}
}

$html = str_replace('<!-- table contents -->', $rowString, $template);

echo $html;


function getFileList($dir) {
	$iterator = new RecursiveDirectoryIterator($dir);
	$iterator = new RecursiveIteratorIterator($iterator);

	$list = array();
	foreach ($iterator as $fileinfo) { // $fileinfoはSplFiIeInfoオブジェクト
		if ($fileinfo->isFile()) {
			$pathName = $fileinfo->getPathname();
			$items = explode('\\', $pathName);
			$count = count($items);
			$file = $items[$count - 1];
			if($count >= 2){
				$category = $items[$count - 2];
			} else {
				$category = 'root';
			}
			$list[$category][] = $file;
		}
	}

	return $list;
}
?>